package kaiyujin.pebble.repository

import kaiyujin.pebble.entity.Sample
import org.seasar.doma.Dao
import org.seasar.doma.Insert
import org.seasar.doma.Select
import org.seasar.doma.boot.ConfigAutowireable
import org.seasar.doma.experimental.Sql
import org.seasar.doma.jdbc.Result
import org.springframework.stereotype.Repository

@ConfigAutowireable
@Dao
@Repository
interface SampleRepository {
    @Sql(
        """
            select name from sample
            """
    )
    @Select
    fun findAll(): List<Sample>

    @Sql(
        """
            select name from sample where name = /* name */'a'
            """
    )
    @Select
    fun findByName(name: String): Sample

    @Insert
    fun create(sample: Sample): Result<Sample>
}