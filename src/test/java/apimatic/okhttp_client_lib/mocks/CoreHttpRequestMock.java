package apimatic.okhttp_client_lib.mocks;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import io.apimatic.core_interfaces.http.request.Request;

public class CoreHttpRequestMock extends HttpHeadersMock {

    @Rule
    public MockitoRule initRule = MockitoJUnit.rule();

    @Mock
    public Request coreHttpRequest;

}
