package kaiyujin.pebble.entity

import org.seasar.doma.Entity

@Entity(immutable = true)
data class Sample(
    val name: String
)