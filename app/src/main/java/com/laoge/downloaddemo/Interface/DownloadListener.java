package com.laoge.downloaddemo.Interface;

/**
 * Created by laoge on 2017/5/31.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
