# Aodify

Show AOD on receiving notifications.

[<img
     src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png"
     alt="Get it on F-Droid"
     height="80">](https://f-droid.org/packages/me.lucky.aodify/)
[<img
     src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png"
     alt="Get it on Google Play"
     height="80">](https://play.google.com/store/apps/details?id=me.lucky.aodify)

<img
     src="https://raw.githubusercontent.com/x13a/Aodify/main/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png"
     width="30%"
     height="30%">

Tiny app to show Always On Display on receiving notifications. While by default the app respects DND settings, you can switch the toggle off in the app to ignore current DND mode and turn on AOD for all notifications.
As most newer phones seem to be missing a notification LED, this app can be used as a replacement.
Tested with Google Pixel and Pixel 6a.

You have to grant `WRITE_SECURE_SETTINGS` permission:
```sh
$ adb shell pm grant me.lucky.aodify android.permission.WRITE_SECURE_SETTINGS
```

## Development
You can test the notification service by sending dummy notifications via adb. For example:
```sh
$ adb shell cmd notification post -S bigtext -t 'Title' 'Tag' 'Multiline text'
```

## Permissions

* NOTIFICATION_LISTENER - turn on AOD on notification
* WRITE_SECURE_SETTINGS - control AOD

## License
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

This application is Free Software: You can use, study share and improve it at your will.
Specifically you can redistribute and/or modify it under the terms of the
[GNU General Public License v3](https://www.gnu.org/licenses/gpl.html) as published by the Free
Software Foundation.
