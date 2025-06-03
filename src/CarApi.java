//api key: B/TEVQUA/6aRgplFpViayg==Rm5VP6TyeFkgxBdY
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class CarApi {
    public static void getCarInfo() {
        String APIkey = "B/TEVQUA/6aRgplFpViayg==Rm5VP6TyeFkgxBdY";
        String queryParameters = "X-Api-Key" + APIkey ;
        String model = "camry";
        String endpoint = "https://api.api-ninjas.com/v1/cars?model=" + model;
        String url = endpoint + queryParameters;
        String urlResponse = "";



    }



}
