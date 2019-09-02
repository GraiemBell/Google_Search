package serpapi;

import java.util.Map;

/***
 * Google Search Results using SerpApi
 *
 * Usage --- ```java Map<String, String> parameter = new HashMap<>();
 * parameter.put("q", "Coffee"); parameter.put("location", "Austin,Texas");
 * parameter.put(SerpApiClient.SERP_API_KEY_NAME, "your secret key");
 * SerpApiClient serp = new SerpApiClient(parameter); ```
 * 
 * JsonObject data = serp.getJson();
 */
class GoogleSearchResults extends SerpApiClient {

  public GoogleSearchResults(Map<String, String> parameter, String apiKey) {
    super(parameter, apiKey, "google");
  }

  public GoogleSearchResults() {
    super("google");
  }

  public GoogleSearchResults(Map<String, String> parameter) {
    super(parameter, "google");
  }
}