# Tasker Setup

## Prerequisites
- Android 7.0+ (Tasker current)
- Tasker (paid) — required
- AutoNotification (paid) — required for real notification blocking

## Import the project
1. Copy `FloodGuard.prj.xml` to your device.
2. Open Tasker → menu (⋮) → **Import** → select the file.
3. Grant the requested permissions:
   - **SMS** (read incoming messages) — Settings → Tasker → SMS
   - **Notifications access** (for AutoNotification) — Settings → AutoNotification
   - **Do Not Disturb access** — Settings → Tasker → DND access
4. Enable the profile and test by sending yourself several texts.

## Configuration
- Threshold: edit the **If** condition in the task (default `%flood_count > 12`).
- Window reset: the separate **FloodReset** profile resets the counter every 60s.
  Adjust the repeat interval to match your definition of "flood".

## Notes
- This mitigates on-device; it does not stop carrier delivery.
- For a persistent campaign, ALSO enable OS "Block unknown senders" and request
  a carrier flood block.
