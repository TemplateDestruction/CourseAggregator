package com.breakout.bestappone.screen.standard;

import io.reactivex.disposables.Disposable;

public interface LoadingView {


    void hideLoadingIndicator();

    void showLoadingIndicator(Disposable disposable);
}
