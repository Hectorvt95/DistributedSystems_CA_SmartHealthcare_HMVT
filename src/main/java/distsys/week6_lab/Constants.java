/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week6_lab;

import io.grpc.Context;
import io.grpc.Metadata;
import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

/**
 *
 * @author marti
 */
public class Constants {
    public static final String JWT_SIGNING_KEY = "HectorValle-DS-CA@2024-Authorization";
    public static final String BEARER_TYPE = "Bearer";

    public static final Metadata.Key<String> AUTHORIZATION_METADATA_KEY = Metadata.Key.of("Authorization", ASCII_STRING_MARSHALLER);
    public static final Context.Key<String> CLIENT_ID_CONTEXT_KEY = Context.key("clientId");

    private Constants() {
        throw new AssertionError();
    }
}
