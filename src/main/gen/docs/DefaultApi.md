# DefaultApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTrainByMatricule**](DefaultApi.md#getTrainByMatricule) | **GET** /trains/{matricule} | Obtenir les informations d&#39;un train |


<a name="getTrainByMatricule"></a>
# **getTrainByMatricule**
> Train getTrainByMatricule(matricule)

Obtenir les informations d&#39;un train

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String matricule = "matricule_example"; // String | Le matricule unique du train (ex: TER-123)
    try {
      Train result = apiInstance.getTrainByMatricule(matricule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTrainByMatricule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **matricule** | **String**| Le matricule unique du train (ex: TER-123) | |

### Return type

[**Train**](Train.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Détails du train trouvés |  -  |
| **404** | Train non trouvé |  -  |

