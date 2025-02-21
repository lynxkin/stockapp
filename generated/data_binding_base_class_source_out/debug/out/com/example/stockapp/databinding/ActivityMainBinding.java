// Generated by view binder compiler. Do not edit!
package com.example.stockapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.stockapp.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView animatedImage1;

  @NonNull
  public final ImageView animatedImage2;

  @NonNull
  public final ViewFlipper backgroundViewFlipper;

  @NonNull
  public final TextView companyNameTextView;

  @NonNull
  public final ProgressBar loadingProgressBar;

  @NonNull
  public final MaterialCardView mainCardView;

  @NonNull
  public final TextView percentageChangeTextView;

  @NonNull
  public final MaterialButton searchButton;

  @NonNull
  public final TextInputEditText searchEditText;

  @NonNull
  public final TextInputLayout searchInputLayout;

  @NonNull
  public final TextView stockPriceTextView;

  @NonNull
  public final CardView stockResultCardView;

  @NonNull
  public final TextView stockSymbolTextView;

  @NonNull
  public final TextView titleTextView;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView animatedImage1,
      @NonNull ImageView animatedImage2, @NonNull ViewFlipper backgroundViewFlipper,
      @NonNull TextView companyNameTextView, @NonNull ProgressBar loadingProgressBar,
      @NonNull MaterialCardView mainCardView, @NonNull TextView percentageChangeTextView,
      @NonNull MaterialButton searchButton, @NonNull TextInputEditText searchEditText,
      @NonNull TextInputLayout searchInputLayout, @NonNull TextView stockPriceTextView,
      @NonNull CardView stockResultCardView, @NonNull TextView stockSymbolTextView,
      @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.animatedImage1 = animatedImage1;
    this.animatedImage2 = animatedImage2;
    this.backgroundViewFlipper = backgroundViewFlipper;
    this.companyNameTextView = companyNameTextView;
    this.loadingProgressBar = loadingProgressBar;
    this.mainCardView = mainCardView;
    this.percentageChangeTextView = percentageChangeTextView;
    this.searchButton = searchButton;
    this.searchEditText = searchEditText;
    this.searchInputLayout = searchInputLayout;
    this.stockPriceTextView = stockPriceTextView;
    this.stockResultCardView = stockResultCardView;
    this.stockSymbolTextView = stockSymbolTextView;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animatedImage1;
      ImageView animatedImage1 = ViewBindings.findChildViewById(rootView, id);
      if (animatedImage1 == null) {
        break missingId;
      }

      id = R.id.animatedImage2;
      ImageView animatedImage2 = ViewBindings.findChildViewById(rootView, id);
      if (animatedImage2 == null) {
        break missingId;
      }

      id = R.id.backgroundViewFlipper;
      ViewFlipper backgroundViewFlipper = ViewBindings.findChildViewById(rootView, id);
      if (backgroundViewFlipper == null) {
        break missingId;
      }

      id = R.id.companyNameTextView;
      TextView companyNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (companyNameTextView == null) {
        break missingId;
      }

      id = R.id.loadingProgressBar;
      ProgressBar loadingProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (loadingProgressBar == null) {
        break missingId;
      }

      id = R.id.mainCardView;
      MaterialCardView mainCardView = ViewBindings.findChildViewById(rootView, id);
      if (mainCardView == null) {
        break missingId;
      }

      id = R.id.percentageChangeTextView;
      TextView percentageChangeTextView = ViewBindings.findChildViewById(rootView, id);
      if (percentageChangeTextView == null) {
        break missingId;
      }

      id = R.id.searchButton;
      MaterialButton searchButton = ViewBindings.findChildViewById(rootView, id);
      if (searchButton == null) {
        break missingId;
      }

      id = R.id.searchEditText;
      TextInputEditText searchEditText = ViewBindings.findChildViewById(rootView, id);
      if (searchEditText == null) {
        break missingId;
      }

      id = R.id.searchInputLayout;
      TextInputLayout searchInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchInputLayout == null) {
        break missingId;
      }

      id = R.id.stockPriceTextView;
      TextView stockPriceTextView = ViewBindings.findChildViewById(rootView, id);
      if (stockPriceTextView == null) {
        break missingId;
      }

      id = R.id.stockResultCardView;
      CardView stockResultCardView = ViewBindings.findChildViewById(rootView, id);
      if (stockResultCardView == null) {
        break missingId;
      }

      id = R.id.stockSymbolTextView;
      TextView stockSymbolTextView = ViewBindings.findChildViewById(rootView, id);
      if (stockSymbolTextView == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, animatedImage1, animatedImage2,
          backgroundViewFlipper, companyNameTextView, loadingProgressBar, mainCardView,
          percentageChangeTextView, searchButton, searchEditText, searchInputLayout,
          stockPriceTextView, stockResultCardView, stockSymbolTextView, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
