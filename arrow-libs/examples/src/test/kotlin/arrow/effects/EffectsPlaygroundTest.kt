package arrow.effects

import arrow.core.Either
import arrow.core.Either.Right
import arrow.core.computations.either
import kotlinx.coroutines.runBlocking
import org.junit.Test

class EffectsPlaygroundTest {

  @Test
  fun runTest(): Unit = runBlocking {
    println("Testing effects")
    test()
  }

  private suspend fun test(): Either<String, Int> =
    either {
      val one = Right(1).bind()
      1 + one
    }
}
