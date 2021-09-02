package com.example.retrofit;

    public class Api {

        public static ApiInterface getClient() {

            // change your base URL
          Api adapter = new Api.Builder()
                    .setEndpoint("https://api.mrmoasilha.com/") //Set the Root URL
                    .build(); //Finally building the adapter

            //Creating object for our interface
            ApiInterface api = adapter.create(ApiInterface.class);
            return api; // return the APIInterface object
        }

    }




