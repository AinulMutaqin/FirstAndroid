package ppsi.fasilkom.com.kandros.helper;

/**
 * Created by Ainul on 7/2/2016.
 */

public class RestClient {
    private String url;
    private int responseCode;
    private String message;
    private String response;

    public enum RequestMethod {
        GET, POST;
    }
}
