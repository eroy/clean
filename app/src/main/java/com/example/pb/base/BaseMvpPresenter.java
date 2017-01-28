package com.example.pb.base;

public interface BaseMvpPresenter<V> {
    void attachView(V view);
    void detachView();
}
