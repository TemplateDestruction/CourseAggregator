package com.breakout.bestappone.screen.standard;

import io.reactivex.disposables.Disposable;

/**
 * @author Artur Vasilov
 */
public interface LoadingView {


    void hideLoadingIndicator();

    void showLoadingIndicator(Disposable disposable);
}
