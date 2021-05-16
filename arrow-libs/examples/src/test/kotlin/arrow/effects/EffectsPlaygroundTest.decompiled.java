// EffectsPlaygroundTest$invoke$$inlined$suspended$1.java
package arrow.effects;

import arrow.continuations.generic.DelimitedScope;
import arrow.continuations.generic.SuspendedScope;
import arrow.core.EitherKt;
import arrow.core.computations.EitherEffect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(
        f = "either.kt",
        l = {25},
        i = {},
        s = {},
        n = {},
        m = "invokeSuspend",
        c = "arrow.effects.EffectsPlaygroundTest$invoke$$inlined$suspended$1"
)
@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 3,
        d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"},
        d2 = {"<anonymous>", "F", "Eff", "Larrow/continuations/Effect;", "A", "Larrow/continuations/generic/SuspendedScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "arrow/continuations/Effect$Companion$suspended$2"}
)
public final class EffectsPlaygroundTest$invoke$$inlined$suspended$1 extends SuspendLambda implements Function2 {
    // $FF: synthetic field
    private Object L$0;
    int label;
    // $FF: synthetic field
    final Function2 $f;

    public EffectsPlaygroundTest$invoke$$inlined$suspended$1(Function2 var1, Continuation var2) {
        super(2, var2);
        this.$f = var1;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
        Object var2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object var10000;
        switch(this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                SuspendedScope $this$suspended = (SuspendedScope)this.L$0;
                DelimitedScope it = (DelimitedScope)$this$suspended;
                Function2 var5 = this.$f;
                int var6 = false;
                EitherEffect var7 = (EitherEffect)(new EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1(it));
                this.label = 1;
                var10000 = var5.invoke(var7, this);
                if (var10000 == var2) {
                    return var2;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                var10000 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        Object var10 = var10000;
        int var9 = false;
        return EitherKt.right(var10);
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object $result) {
        SuspendedScope $this$suspended = (SuspendedScope)this.L$0;
        DelimitedScope it = (DelimitedScope)$this$suspended;
        Function2 var7 = this.$f;
        int var4 = false;
        EitherEffect var8 = (EitherEffect)(new EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1(it));
        InlineMarker.mark(0);
        Object var10000 = var7.invoke(var8, this);
        InlineMarker.mark(1);
        Object var9 = var10000;
        int var6 = false;
        return EitherKt.right(var9);
    }

    @NotNull
    public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        EffectsPlaygroundTest$invoke$$inlined$suspended$1 var3 = new EffectsPlaygroundTest$invoke$$inlined$suspended$1(this.$f, completion);
        var3.L$0 = value;
        return var3;
    }

    public final Object invoke(Object var1, Object var2) {
        return ((EffectsPlaygroundTest$invoke$$inlined$suspended$1)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
    }
}
// Effect$Companion$suspended$2.java
package arrow.continuations;

        import arrow.continuations.generic.SuspendedScope;
        import kotlin.Metadata;
        import kotlin.ResultKt;
        import kotlin.Unit;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.coroutines.jvm.internal.DebugMetadata;
        import kotlin.coroutines.jvm.internal.SuspendLambda;
        import kotlin.jvm.functions.Function1;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@DebugMetadata(
        f = "Effect.kt",
        l = {14},
        i = {},
        s = {},
        n = {},
        m = "invokeSuspend",
        c = "arrow.continuations.Effect$Companion$suspended$2"
)
@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 3,
        d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"},
        d2 = {"<anonymous>", "F", "Eff", "Larrow/continuations/Effect;", "A", "Larrow/continuations/generic/SuspendedScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}
)
public final class Effect$Companion$suspended$2 extends SuspendLambda implements Function2 {
    // $FF: synthetic field
    private Object L$0;
    int label;
    // $FF: synthetic field
    final Function1 $just;
    // $FF: synthetic field
    final Function2 $f;
    // $FF: synthetic field
    final Function1 $eff;

    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
        Object var5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object var10000;
        Function1 var3;
        switch(this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                SuspendedScope $this$suspended = (SuspendedScope)this.L$0;
                var3 = this.$just;
                Function2 var6 = this.$f;
                Object var10001 = this.$eff.invoke($this$suspended);
                this.L$0 = var3;
                this.label = 1;
                var10000 = var6.invoke(var10001, this);
                if (var10000 == var5) {
                    return var5;
                }
                break;
            case 1:
                var3 = (Function1)this.L$0;
                ResultKt.throwOnFailure($result);
                var10000 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        Object var4 = var10000;
        return var3.invoke(var4);
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object $result) {
        SuspendedScope $this$suspended = (SuspendedScope)this.L$0;
        Function1 var3 = this.$just;
        Object var4 = this.$f.invoke(this.$eff.invoke($this$suspended), this);
        return var3.invoke(var4);
    }

    public Effect$Companion$suspended$2(Function1 var1, Function2 var2, Function1 var3, Continuation var4) {
        super(2, var4);
        this.$just = var1;
        this.$f = var2;
        this.$eff = var3;
    }

    @NotNull
    public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        Effect$Companion$suspended$2 var3 = new Effect$Companion$suspended$2(this.$just, this.$f, this.$eff, completion);
        var3.L$0 = value;
        return var3;
    }

    public final Object invoke(Object var1, Object var2) {
        return ((Effect$Companion$suspended$2)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
    }
}
// EffectsPlaygroundTest$test$$inlined$invoke$1$1.java
package arrow;

        import arrow.continuations.generic.DelimitedScope;
        import arrow.core.Either;
        import arrow.core.Validated;
        import arrow.core.computations.EitherEffect;
        import arrow.core.computations.EitherEffect.DefaultImpls;
        import kotlin.Metadata;
        import kotlin.coroutines.Continuation;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 3,
        d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"},
        d2 = {"<anonymous>", "Larrow/continuations/generic/DelimitedScope;", "Larrow/core/Either;", "E", "A", "control", "arrow/core/computations/either$invoke$2$1", "arrow/EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1"}
)
public final class EffectsPlaygroundTest$test$$inlined$invoke$1$1 implements EitherEffect {
    // $FF: synthetic field
    final DelimitedScope $it;

    public EffectsPlaygroundTest$test$$inlined$invoke$1$1(DelimitedScope var1) {
        this.$it = var1;
    }

    @NotNull
    public final DelimitedScope control() {
        return this.$it;
    }

    @Nullable
    public Object bind(@NotNull Either $this$bind, @NotNull Continuation var2) {
        return DefaultImpls.bind(this, $this$bind, var2);
    }

    @Nullable
    public Object bind(@NotNull Validated $this$bind, @NotNull Continuation var2) {
        return DefaultImpls.bind(this, $this$bind, var2);
    }
}
// EffectsPlaygroundTest$test$$inlined$invoke$1.java
package arrow;

        import arrow.continuations.generic.DelimitedScope;
        import arrow.continuations.generic.SuspendedScope;
        import arrow.core.Either;
        import arrow.core.EitherKt;
        import arrow.core.Either.Right;
        import arrow.core.computations.EitherEffect;
        import kotlin.Metadata;
        import kotlin.ResultKt;
        import kotlin.Unit;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.coroutines.jvm.internal.Boxing;
        import kotlin.coroutines.jvm.internal.DebugMetadata;
        import kotlin.coroutines.jvm.internal.SuspendLambda;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@DebugMetadata(
        f = "EffectsPlaygroundTest.kt",
        l = {26},
        i = {},
        s = {},
        n = {},
        m = "invokeSuspend",
        c = "arrow.effects.EffectsPlaygroundTest$test$$inlined$invoke$1"
)
@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 3,
        d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"},
        d2 = {"<anonymous>", "F", "Eff", "Larrow/continuations/Effect;", "A", "Larrow/continuations/generic/SuspendedScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "arrow/continuations/Effect$Companion$suspended$2", "arrow/EffectsPlaygroundTest$invoke$$inlined$suspended$1"}
)
public final class EffectsPlaygroundTest$test$$inlined$invoke$1 extends SuspendLambda implements Function2 {
    // $FF: synthetic field
    private Object L$0;
    int label;

    public EffectsPlaygroundTest$test$$inlined$invoke$1(Continuation var1) {
        super(2, var1);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
        Object var2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean var9;
        Object var10000;
        switch(this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                SuspendedScope $this$suspended = (SuspendedScope)this.L$0;
                DelimitedScope it = (DelimitedScope)$this$suspended;
                int var5 = false;
                EitherEffect var6 = (EitherEffect)(new EffectsPlaygroundTest$test$$inlined$invoke$1$1(it));
                Continuation continuation = (Continuation)this;
                var9 = false;
                Either var10001 = (Either)(new Right(Boxing.boxInt(1)));
                this.label = 1;
                var10000 = var6.bind(var10001, this);
                if (var10000 == var2) {
                    return var2;
                }
                break;
            case 1:
                var9 = false;
                ResultKt.throwOnFailure($result);
                var10000 = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        int one = ((Number)var10000).intValue();
        Integer var13 = Boxing.boxInt(1 + one);
        int var12 = false;
        return EitherKt.right(var13);
    }

    @NotNull
    public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        EffectsPlaygroundTest$test$$inlined$invoke$1 var3 = new EffectsPlaygroundTest$test$$inlined$invoke$1(completion);
        var3.L$0 = value;
        return var3;
    }

    public final Object invoke(Object var1, Object var2) {
        return ((EffectsPlaygroundTest$test$$inlined$invoke$1)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
    }
}
// EffectsPlaygroundTest.java
package arrow;

        import arrow.continuations.Effect;
        import arrow.continuations.Reset;
        import arrow.continuations.Effect.Companion;
        import arrow.core.computations.either;
        import kotlin.Metadata;
        import kotlin.ResultKt;
        import kotlin.Unit;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.CoroutineContext;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Intrinsics;
        import kotlinx.coroutines.BuildersKt;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;
        import org.junit.Test;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"},
        d2 = {"Larrow/EffectsPlaygroundTest;", "", "()V", "runTest", "", "test", "Larrow/core/Either;", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arrow-libs.examples.test"}
)
public final class EffectsPlaygroundTest {
    @Test
    public final void runTest() {
        BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)(new Function2((Continuation)null) {
            int label;

            @Nullable
            public final Object invokeSuspend(@NotNull Object $result) {
                Object var4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        String var2 = "Testing effects";
                        boolean var3 = false;
                        System.out.println(var2);
                        EffectsPlaygroundTest var10000 = EffectsPlaygroundTest.this;
                        this.label = 1;
                        if (var10000.test(this) == var4) {
                            return var4;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                return Unit.INSTANCE;
            }

            @NotNull
            public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                Function2 var3 = new <anonymous constructor>(completion);
                return var3;
            }

            public final Object invoke(Object var1, Object var2) {
                return ((<undefinedtype>)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
            }
        }), 1, (Object)null);
    }

    private final Object test(Continuation $completion) {
        either this_$iv = either.INSTANCE;
        int $i$f$invoke = false;
        Companion this_$iv$iv = Effect.Companion;
        int $i$f$suspended = false;
        return Reset.INSTANCE.suspended((Function2)(new EffectsPlaygroundTest$test$$inlined$invoke$1((Continuation)null)), $completion);
    }
}
// EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1.java
package arrow;

        import arrow.continuations.generic.DelimitedScope;
        import arrow.core.Either;
        import arrow.core.Validated;
        import arrow.core.computations.EitherEffect;
        import arrow.core.computations.EitherEffect.DefaultImpls;
        import kotlin.Metadata;
        import kotlin.coroutines.Continuation;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 3,
        d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"},
        d2 = {"<anonymous>", "Larrow/continuations/generic/DelimitedScope;", "Larrow/core/Either;", "E", "A", "control", "arrow/core/computations/either$invoke$2$1"}
)
public final class EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1 implements EitherEffect {
    // $FF: synthetic field
    final DelimitedScope $it;

    public EffectsPlaygroundTest$invoke$$inlined$suspended$1$lambda$1(DelimitedScope var1) {
        this.$it = var1;
    }

    @NotNull
    public final DelimitedScope control() {
        return this.$it;
    }

    @Nullable
    public Object bind(@NotNull Either $this$bind, @NotNull Continuation var2) {
        return DefaultImpls.bind(this, $this$bind, var2);
    }

    @Nullable
    public Object bind(@NotNull Validated $this$bind, @NotNull Continuation var2) {
        return DefaultImpls.bind(this, $this$bind, var2);
    }
}
