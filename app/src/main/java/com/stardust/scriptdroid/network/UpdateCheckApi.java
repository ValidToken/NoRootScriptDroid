package com.stardust.scriptdroid.network;

import com.stardust.scriptdroid.network.entity.VersionInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Stardust on 2017/9/20.
 */

public interface UpdateCheckApi {

    @GET("/hyb1996/NoRootScriptDroid/master/version.json")
    Observable<VersionInfo> checkForUpdates();

}