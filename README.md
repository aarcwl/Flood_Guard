# Flood_Guard
this tool (FloodGuard) is a defensive anti-harassment app: it sits on your own phone, detects an inbound SMS flood, and auto-blocks/mutes it.
# FloodGuard — Defensive SMS Flood Mitigation

**FloodGuard detects and automatically mitigates an inbound SMS flood
(SMS bombing) against YOUR OWN phone number.** It is a personal anti-harassment
tool. It does not and cannot send messages to anyone.

> ⚠️ **What this is NOT:** FloodGuard is *not* an SMS bombing tool. It contains
> no ability to send SMS, and it only acts on messages already arriving at your
> device. Building, distributing, or using a tool to spam third parties is
> illegal (TCPA / CAN-SPAM / GDPR etc. depending on jurisdiction) and abusive.
> This project exists only for defense against harassment.

## Why this exists

SMS bombing works by abusing unauthenticated messaging APIs to flood a victim's
number. Because delivery happens at the carrier network level, **no on-device
app can prevent the messages from arriving**. FloodGuard's goal is realistic:
detect the flood pattern and *silence + block it* so the attack has no practical
impact on the target's device.

## How it works

1. Every inbound SMS increments a per-window counter.
2. If the count exceeds a threshold (default 12) within the sliding window,
   FloodGuard:
   - Blocks the offending sender,
   - Drops the phone into total silence (Do Not Disturb),
   - Notifies the user that mitigation is active.
3. Combine with your OS "block unknown senders" setting so rotating numbers are
   auto-silenced by the platform.

## Repository contents

| Path | Purpose |
|------|---------|
| `tasker/FloodGuard.prj.xml` | Ready-to-import Tasker project (recommended) |
| `android-kotlin/FloodDetector.kt` | Reference logic for a from-scratch Android app |
| `docs/LIMITATIONS.md` | Honest capability/scope notes |
| `requirements.txt` | Runtime dependencies |

## Recommended install (Tasker route)

1. Install [Tasker](https://play.google.com/store/apps/details?id=net.dinglisch.tasker)
   and the [AutoNotification](https://play.google.com/store/apps/details?id=com.joaomgcd.autonotification) plugin.
2. Import `tasker/FloodGuard.prj.xml`.
3. Follow `tasker/SETUP.md` for permissions and tuning.

## Legal & responsible-use notice

Use only on phone numbers you own or are explicitly authorized to protect.
If you are being harassed, contact your carrier for a network-level flood block
and report sustained abuse to the relevant authorities. **Preserve logs and
timestamps** — a flood is often a smokescreen for a credential/2FA attack and
is evidence for law enforcement.

## License

MIT — see [LICENSE](LICENSE).
