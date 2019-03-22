package serpapi;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class GoogleSearchResultsImplementationTest
{

    @Test
    public void main() throws GoogleSearchException
    {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("q", "Coffee");
        parameter.put("location", "Austin,Texas");

        String api_key = System.getenv("API_KEY");
        if(api_key== null) {
            api_key = "demo";
        }
        parameter.put(GoogleSearchResults.SERP_API_KEY_NAME, api_key);
        GoogleSearchResults serp = new GoogleSearchResults(parameter);

        JsonObject data = serp.getJson();
        JsonArray results = (JsonArray) data.get("local_results");
        JsonObject first_result = results.get(0).getAsJsonObject();
        assertNotNull(first_result.get("title"));
    }
}
