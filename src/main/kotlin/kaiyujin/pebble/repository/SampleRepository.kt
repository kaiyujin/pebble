package kaiyujin.pebble.repository

import kaiyujin.pebble.entity.Sample
import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable
import org.seasar.doma.experimental.Sql
import org.springframework.stereotype.Repository

@ConfigAutowireable
@Dao
@Repository
interface SampleRepository {
    @Sql("""
  select name from sample
  """)
    @Select
    fun findAll(): List<Sample>
}