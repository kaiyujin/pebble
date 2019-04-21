package kaiyujin.pebble.entity

import org.seasar.doma.Entity
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

@Entity(immutable = true)
data class Sample(
    @field:NotEmpty
    @field:Size(min = 2, max = 10)
    val name: String
)