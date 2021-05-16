// SuspendingComputationKt.java
package arrow.effects;

import arrow.continuations.generic.EMPTY_VALUE;
import arrow.continuations.generic.ShortCircuit;
import arrow.continuations.generic.SuspendedScope;
import arrow.continuations.generic.Token;
import kotlin.Metadata;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 2,
        d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0003"},
        d2 = {"SUSPENDED", "", "UNDECIDED", "arrow-libs.arrow-continuations.main"}
)
public final class SuspendingComputationKt {
    public static final int UNDECIDED = 0;
    public static final int SUSPENDED = 1;
}
// SuspendMonadContinuation.java
package arrow.continuations.generic;

        import kotlin.Metadata;
        import kotlin.PublishedApi;
        import kotlin.Result;
        import kotlin.ResultKt;
        import kotlin.Result.Companion;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.CoroutineContext;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Intrinsics;
        import kotlin.jvm.internal.TypeIntrinsics;
        import kotlinx.atomicfu.AtomicFU;
        import kotlinx.atomicfu.AtomicRef;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 3},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0001J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010 \u001a\u0004\u0018\u00010\u0007*\u00020!H\u0002J\u000f\u0010\"\u001a\u0004\u0018\u00010#*\u00020!H\u0082\u0010R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR=\u0010\u0005\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"},
        d2 = {"Larrow/continuations/generic/SuspendMonadContinuation;", "R", "Lkotlin/coroutines/Continuation;", "Larrow/continuations/generic/SuspendedScope;", "parent", "f", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;)V", "_decision", "Lkotlinx/atomicfu/AtomicRef;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getF", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "token", "Larrow/continuations/generic/Token;", "getResult", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "shift", "A", "r", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startCoroutineUninterceptedOrReturn", "shiftedOrNull", "", "shortCircuitCause", "Larrow/continuations/generic/ShortCircuit;", "arrow-libs.arrow-continuations.main"}
)
public class SuspendMonadContinuation implements Continuation, SuspendedScope {
    private final AtomicRef _decision;
    private final Token token;
    @NotNull
    private final CoroutineContext context;
    private final Continuation parent;
    @NotNull
    private final Function2 f;

    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    public void resumeWith(@NotNull Object result) {
        AtomicRef $this$loop$iv = this._decision;
        boolean var3 = false;

        Object r;
        do {
            Object decision = $this$loop$iv.getValue();
            int var5 = false;
            boolean var8;
            boolean var9;
            boolean var11;
            boolean $i$f$unbox;
            Object var10000;
            Throwable var18;
            if (!Intrinsics.areEqual(decision, 0)) {
                var8 = false;
                var9 = false;
                var18 = Result.exceptionOrNull-impl(result);
                if (var18 == null) {
                    var11 = false;
                    Companion var20 = Result.Companion;
                    boolean var22 = false;
                    var10000 = Result.constructor-impl(result);
                } else {
                    var11 = false;
                    Object x = this.shiftedOrNull(var18);
                    Companion var23;
                    if (x == EMPTY_VALUE.INSTANCE) {
                        var23 = Result.Companion;
                        $i$f$unbox = false;
                        var10000 = Result.constructor-impl(ResultKt.createFailure(var18));
                    } else {
                        var23 = Result.Companion;
                        EMPTY_VALUE this_$iv = EMPTY_VALUE.INSTANCE;
                        int $i$f$unbox = false;
                        Object var25 = x == this_$iv ? null : x;
                        $i$f$unbox = false;
                        var10000 = Result.constructor-impl(var25);
                    }
                }

                r = var10000;
                this.parent.resumeWith(r);
                return;
            }

            var8 = false;
            var9 = false;
            var18 = Result.exceptionOrNull-impl(result);
            Object value$iv;
            if (var18 == null) {
                var11 = false;
                var10000 = result;
            } else {
                var11 = false;
                EMPTY_VALUE this_$iv = EMPTY_VALUE.INSTANCE;
                value$iv = this.shiftedOrNull(var18);
                $i$f$unbox = false;
                var10000 = value$iv == this_$iv ? null : value$iv;
            }

            r = var10000;
            if (r == null) {
                Continuation var7 = this.parent;
                Throwable var26 = Result.exceptionOrNull-impl(result);
                Intrinsics.checkNotNull(var26);
                Throwable var17 = var26;
                var9 = false;
                Companion var10 = Result.Companion;
                boolean var19 = false;
                value$iv = Result.constructor-impl(ResultKt.createFailure(var17));
                var7.resumeWith(value$iv);
                return;
            }
        } while(!this._decision.compareAndSet(0, r));

    }

    @PublishedApi
    @Nullable
    public final Object getResult() {
        AtomicRef $this$loop$iv = this._decision;
        boolean var2 = false;

        do {
            Object decision = $this$loop$iv.getValue();
            int var4 = false;
            if (!Intrinsics.areEqual(decision, 0)) {
                return decision;
            }
        } while(!this._decision.compareAndSet(0, 1));

        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private final ShortCircuit shortCircuitCause(Throwable $this$shortCircuitCause) {
        while(true) {
            Throwable cause = $this$shortCircuitCause.getCause();
            ShortCircuit var10000;
            if (cause == null) {
                var10000 = null;
            } else {
                if (!(cause instanceof ShortCircuit)) {
                    $this$shortCircuitCause = cause;
                    continue;
                }

                var10000 = (ShortCircuit)cause;
            }

            return var10000;
        }
    }

    private final Object shiftedOrNull(Throwable $this$shiftedOrNull) {
        ShortCircuit shortCircuit = $this$shiftedOrNull instanceof ShortCircuit ? (ShortCircuit)$this$shiftedOrNull : this.shortCircuitCause($this$shiftedOrNull);
        return shortCircuit != null && shortCircuit.getToken$arrow_libs_arrow_continuations_main() == this.token ? shortCircuit.getRaiseValue() : EMPTY_VALUE.INSTANCE;
    }

    @Nullable
    public Object shift(Object var1, @NotNull Continuation $completion) {
        return shift$suspendImpl(this, var1, $completion);
    }

    // $FF: synthetic method
    static Object shift$suspendImpl(SuspendMonadContinuation var0, Object r, Continuation $completion) {
        throw (Throwable)(new ShortCircuit(var0.token, r));
    }

    @Nullable
    public final Object startCoroutineUninterceptedOrReturn() {
        Object var1;
        try {
            Function2 var7 = this.f;
            Continuation var8 = (Continuation)this;
            boolean var4 = false;
            if (var7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }

            Object var10000 = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(var7, 2)).invoke(this, var8);
            if (var10000 != null) {
                var1 = var10000;
                boolean var2 = false;
                boolean var9 = false;
                int var5 = false;
                var10000 = Intrinsics.areEqual(var1, IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? this.getResult() : var1;
            } else {
                var10000 = null;
            }

            var1 = var10000;
        } catch (Throwable var6) {
            Object x = this.shiftedOrNull(var6);
            if (x == EMPTY_VALUE.INSTANCE) {
                throw var6;
            }

            var1 = x;
        }

        return var1;
    }

    @NotNull
    public final Function2 getF() {
        return this.f;
    }

    public SuspendMonadContinuation(@NotNull Continuation parent, @NotNull Function2 f) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(f, "f");
        super();
        this.parent = parent;
        this.f = f;
        this._decision = AtomicFU.atomic(0);
        this.token = new Token();
        this.context = this.parent.getContext();
    }
}
