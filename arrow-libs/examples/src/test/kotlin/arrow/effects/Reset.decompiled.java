package arrow.effects;

import arrow.continuations.generic.DelimContScope;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJF\u0010\u000b\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"},
        d2 = {"Larrow/continuations/Reset;", "", "()V", "restricted", "A", "block", "Lkotlin/Function2;", "Larrow/continuations/generic/RestrictedScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "suspended", "Larrow/continuations/generic/SuspendedScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arrow-libs.arrow-continuations.main"}
)
@PublishedApi
public final class Reset {
    @NotNull
    public static final Reset INSTANCE;

    @Nullable
    public final Object suspended(@NotNull Function2 block, @NotNull Continuation $completion) {
        int var4 = false;
        Object var10000 = (new SuspendMonadContinuation($completion, block)).startCoroutineUninterceptedOrReturn();
        if (var10000 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }

        return var10000;
    }

    public final Object restricted(@NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (new DelimContScope(block)).invoke();
    }

    private Reset() {
    }

    static {
        Reset var0 = new Reset();
        INSTANCE = var0;
    }
}
