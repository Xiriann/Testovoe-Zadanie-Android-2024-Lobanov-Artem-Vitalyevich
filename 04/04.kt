interface Subscriber {
    fun update(news: String)
}

// Реализация издателя
class NewsPoster {
    private val subscribers = mutableListOf<Subscriber>()

    // Метод для подписки наблюдателей
    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    // Метод для отписки наблюдателей
    fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    // Уведомление всех подписчиков о новости
    fun postNews(news: String) {
        subscribers.forEach { it.update(news) }
    }
}

// Реализация конкретного наблюдателя
class ConcreteSubscriber : Subscriber {
    override fun update(news: String) {
        println("Новость получена: $news")
    }
}

// Пример использования
fun main() {
    val newsPoster = NewsPoster()
    val subscriber1 = ConcreteSubscriber()
    val subscriber2 = ConcreteSubscriber()

    newsPoster.subscribe(subscriber1)
    newsPoster.subscribe(subscriber2)

    newsPoster.postNews("news 1")
    newsPoster.unsubscribe(subscriber1)
    newsPoster.postNews("news 2")
}