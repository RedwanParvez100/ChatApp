package com.example.chatapp.firebase;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

    public void onNewToken(@NonNull  String token){
        super.onNewToken(token);
    }

    public void onMessageReceived(@NonNull @org.jetbrains.annotations.NotNull RemoteMessage remoteMessage){
        super.onMessageReceived(remoteMessage);

    }
}

