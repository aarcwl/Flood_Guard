# Limitations — read before trusting this tool

FloodGuard is a mitigation layer, NOT a complete solution. Be realistic about
its scope:

## What it CAN do
- Detect an inbound flood pattern on your own device.
- Auto-block the offending sender and silence notifications.
- Be combined with OS-level "block unknown senders" to handle rotating numbers.

## What it CANNOT do
- **Prevent delivery.** SMS is routed by your carrier. No on-device app stops a
  message before it reaches the handset.
- **Stop a carrier-level flood.** Only your carrier's abuse/flood block can.
- **Block messages from a default-SMS-handler app** reliably without system
  privileges.

## Effective deployment checklist
1. OS "block unknown senders" = ON.
2. FloodGuard running + threshold tuned.
3. **Carrier flood block requested** (the decisive lever).
4. Watch for legitimate alerts buried in the flood (password resets, 2FA,
   banking) — floods are often a smokescreen for credential theft.
5. Document timestamps + sender numbers; report sustained abuse to authorities.

## One-line summary
FloodGuard makes the attack *silent and self-managing* on your device; only a
carrier flood block stops it at the network.
