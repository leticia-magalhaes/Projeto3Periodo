/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsultaCep {
     public String buscarCep(String cep) {
        String json;

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection;
            urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));

            json = jsonSb.toString();
            
            Map<String,String> mapa = new HashMap<>();

            Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
            while (matcher.find()) {
                String[] group = matcher.group().split(":");
                mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
            }
            
            String semRetorno = "Sem retorno.";
            
            Cep = mapa.getOrDefault("cep",semRetorno);
            Logradouro = mapa.getOrDefault("logradouro",semRetorno);
            Complemento = mapa.getOrDefault("complemento",semRetorno);
            Bairro = mapa.getOrDefault("bairro",semRetorno);
            Localidade = mapa.getOrDefault("localidade",semRetorno);
            Uf = mapa.getOrDefault("uf",semRetorno);
            Unidade = mapa.getOrDefault("unidade",semRetorno);
            Ibge = mapa.getOrDefault("ibge",semRetorno);
            Gia = mapa.getOrDefault("gia",semRetorno);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return json;
    }
     
   public String Cep;
   public String Logradouro;
   public String Complemento;
   public String Bairro;
   public String Localidade;
   public String Uf;
   public String Unidade;
   public String Ibge;
   public String Gia;

}