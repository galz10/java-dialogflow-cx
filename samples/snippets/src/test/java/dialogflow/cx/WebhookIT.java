/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dialogflow.cx;

import static com.google.common.truth.Truth.assertThat;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.mockito.Mockito.when;

import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.emailnotifier.BearerTokenProvider.Token;
import com.google.testing.testsize.LargeTest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class WebhookIT {

    private ByteArrayOutputStream stdOut;

    private static BufferedReader getRequestJSONReader() {
    byte[] b =
        ("{
            \"fulfillmentInfo\": {
            \"tag\": \"Default Welcome Intent\",
            },
            \"text\": \"hi\",
            \"languageCode\": \"en\",
          };")
            .getBytes(UTF_8);
    InputStream is = new ByteArrayInputStream(b);
    return new BufferedReader(new InputStreamReader(is, UTF_8));
  }


  @Before
  public void setUp() throws IOException {

    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
  }

  @Test
  public void testWebhook() throws IOException {
    when(request.getReader()).thenReturn(getRequestJSONReader());
    Webhook.handleWebhook()
    assertThat(stdOut.toString()).contains("Hi from a GCF Webhook");

  }
}