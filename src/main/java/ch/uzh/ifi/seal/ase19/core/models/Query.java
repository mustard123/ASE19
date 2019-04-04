package ch.uzh.ifi.seal.ase19.core.models;

import java.util.Objects;

public class Query {
    private String receiverType;
    private SurroundingExpression surroundingType;
    private ObjectOrigin objectOrigin;
    private String requiredType;
    private EnclosingMethodSignature enclosingMethodSignature;


    public Query(String receiverType, SurroundingExpression surroundingType, ObjectOrigin objectOrigin, String requiredType, EnclosingMethodSignature enclosingMethodSignature) {
        this.receiverType = receiverType;
        this.surroundingType = surroundingType;
        this.objectOrigin = objectOrigin;
        this.requiredType = requiredType;
        this.enclosingMethodSignature = enclosingMethodSignature;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public SurroundingExpression getSurroundingType() {
        return surroundingType;
    }

    public ObjectOrigin getObjectOrigin() {
        return objectOrigin;
    }

    public String getRequiredType() {
        return requiredType;
    }

    public EnclosingMethodSignature getEnclosingMethodSignature() {
        return enclosingMethodSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Query query = (Query) o;
        return Objects.equals(receiverType, query.receiverType) &&
                surroundingType == query.surroundingType &&
                objectOrigin == query.objectOrigin &&
                Objects.equals(requiredType, query.requiredType) &&
                Objects.equals(enclosingMethodSignature, query.enclosingMethodSignature);
    }
}