package io.github.opencubicchunks.stirrin.ty;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class MethodEntry {
    public final String name;
    public final List<SpecifiedType> parameters;
    public final SpecifiedType returnType;
    public final Set<String> typeParameters;
    @Nullable public final String methodSignature;

    public MethodEntry(String name, List<SpecifiedType> parameters, SpecifiedType returnType, Set<String> typeParameters, @Nullable String methodSignature) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.typeParameters = typeParameters;
        this.methodSignature = methodSignature;
    }
}
