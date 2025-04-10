/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week6_lab;

import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.CallCredentials.MetadataApplier;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import java.util.concurrent.Executor;

/**
 *
 * @author marti
 */
public class JwtCallCredentials implements CallCredentials {
    private final String token;

    public JwtCallCredentials(String token) {
        this.token = token;
    }
   
    
    @Override
    public void thisUsesUnstableApi() {
        // Required for using CallCredentials
    }

    @Override
    public void applyRequestMetadata(MethodDescriptor<?, ?> md, Attributes atrbts, Executor exctr, MetadataApplier ma) {
        exctr.execute(() -> {
            Metadata headers = new Metadata();
            Metadata.Key<String> authorizationKey = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
            headers.put(authorizationKey, "Bearer " + token);
            ma.apply(headers);
        });
    }
}