package com.squareup.timessquare;

import android.util.Log;

/** Log utility class to handle the log tag and DEBUG-only logging. */
final class Logr {
  private static final boolean ENABLED = false;

  public static void d(String message) {
    if (ENABLED && BuildConfig.DEBUG) {
      Log.d("TimesSquare", message);
    }
  }

  public static void d(String message, Object... args) {
    if (ENABLED && BuildConfig.DEBUG) {
      d(String.format(message, args));
    }
  }
}
