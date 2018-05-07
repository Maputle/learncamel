package learncamel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreateUsersProcessor  implements Processor {
    public void process(Exchange exchange) throws Exception {

        String input = exchange.getIn().getBody(String.class);

    }
}
