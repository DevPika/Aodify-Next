package me.lucky.aodify

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager

class Preferences(ctx: Context) {
    companion object {
        const val SERVICE_ENABLED = "service_enabled"
        const val RESPECT_DND = "respect_dnd"
        const val RESET_NOTIFICATION_SCREEN_ON = "reset_notification_screen_on"
    }

    private val prefs = PreferenceManager.getDefaultSharedPreferences(ctx)

    var isServiceEnabled: Boolean
        get() = prefs.getBoolean(SERVICE_ENABLED, false)
        set(value) = prefs.edit { putBoolean(SERVICE_ENABLED, value) }

    var isDNDRespected: Boolean
        get() = prefs.getBoolean(RESPECT_DND, true)
        set(value) = prefs.edit { putBoolean(RESPECT_DND, value) }

    var isNotificationResetScreenOn: Boolean
        get() = prefs.getBoolean(RESET_NOTIFICATION_SCREEN_ON, true)
        set(value) = prefs.edit { putBoolean(RESET_NOTIFICATION_SCREEN_ON, value) }

    fun registerListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
        prefs.registerOnSharedPreferenceChangeListener(listener)
    }

    fun unregisterListener(listener: SharedPreferences.OnSharedPreferenceChangeListener) {
        prefs.unregisterOnSharedPreferenceChangeListener(listener)
    }
}
