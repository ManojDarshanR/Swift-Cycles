package com.foodys.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAWRkrn4w:APA91bG3e8WbYEQW4_rrc31NARGq07WLZiTw66tupuxlxtTGBItgZ-cvaVJ_b3Q2elbQx5PCS4_HTowoQwwpWjim43AEGqEsRkyB-R4P76Mu4bKOP_GO_4KzSMx42HPGC0mERVeIRcQ5"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
