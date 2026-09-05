// FloodGuard detection core — listens for inbound SMS and flags flooding.
object FloodDetector {
    val perSenderCounts = mutableMapOf<String, MutableList<Long>>()
    val WINDOW_MS = 60_000L
    val THRESHOLD = 12

    fun onIncomingSms(sender: String, timestamp: Long) {
        val stamps = perSenderCounts.getOrPut(sender) { mutableListOf() }
        stamps.add(timestamp)
        stamps.removeAll { timestamp - it > WINDOW_MS } // sliding window

        if (stamps.size > THRESHOLD) {
            // Notification-level block/mute hook goes here.
            perSenderCounts.remove(sender)
        }
    }
}
