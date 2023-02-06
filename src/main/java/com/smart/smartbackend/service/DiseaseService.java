package com.smart.smartbackend.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import com.smart.smartbackend.entity.Diseases;
import com.smart.smartbackend.entity.Register;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class DiseaseService {


    private static final String COLLECTION_NAME = "diseases";

    public String saveDisease(Diseases diseases) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionApiFuture= dbFirestore.collection(COLLECTION_NAME).document(diseases.getName()).set(diseases);
        return collectionApiFuture.get().getUpdateTime().toString();
    }
}
