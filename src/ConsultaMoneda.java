import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public double buscarMoneda(String base_code, String target_code) {


        URI uri = URI.create("https://v6.exchangerate-api.com/v6/33c78ba124e3c657ddacbb66/pair/"+base_code+"/"+target_code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            return jsonObject.get("conversion_rate").getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Moneda.");
        }

    }

}
