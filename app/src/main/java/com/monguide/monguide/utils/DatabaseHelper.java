package com.monguide.monguide.utils;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DatabaseHelper {

    public static DatabaseReference getReferenceToRoot() {
        return FirebaseDatabase.getInstance().getReference();
    }

    public static DatabaseReference getReferenceToAllUsers() {
        return getReferenceToRoot().child("users");
    }

    public static DatabaseReference getReferenceToParticularUser(String uid) {
        return getReferenceToAllUsers().child(uid);
    }

    public static DatabaseReference getReferenceToAllQuestions() {
        return getReferenceToRoot().child("questions");
    }

    public static DatabaseReference getReferenceToParticularQuestion(String qid) {
        return getReferenceToAllQuestions().child(qid);
    }



}