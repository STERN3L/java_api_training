package fr.lernejo.server;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpHandler;


public class HttpHandlerHomeMade implements HttpHandler {


    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String body = "Hello";


        exchange.sendResponseHeaders(200, body.length());
        try (OutputStream os = exchange.getResponseBody()) { // (1)
            os.write(body.getBytes());
        }
    }
}