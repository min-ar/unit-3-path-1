package practice
import practice.pac2.Event
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
fun main(){
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}