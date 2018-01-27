# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in D:\Users\Manuel\AppData\Local\Android\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
#-keep class !android.support.v7.internal.view.menu.**,android.support.** {*;}
#-keep class io.google.android.gms.** { *; }
#-keep class io.squareup.okhttp.** { *; }

#-keep interface io.squareup.okhttp.** { *; }
#-dontwarn rx.**

#-dontwarn okio.**
#-dontwarn retrofit.appengine.UrlFetchClient
#-keep class retrofit.** { *; }
#-keepclasseswithmembers class * {
#    @retrofit.http.* <methods>;
#}

#-keepattributes Signature
#-keepattributes *Annotation*

#-dontwarn io.google.android.gms.**

#-dontwarn android.support.v4.**

#-dontwarn io.squareup.javapoet.**
#-dontwarn io.fasterxml.jackson.**
#-dontwarn org.spongycastle.**
#-dontwarn org.web3j.codegen.**
#-dontwarn rx.internal.util.**
-keep class !io.** { *; }

-dontwarn !io.**,**
-assumenosideeffects class android.util.Log {
public static *** d(...);
public static *** v(...);
public static *** i(...);
public static *** w(...);
public static *** e(...);
    }
