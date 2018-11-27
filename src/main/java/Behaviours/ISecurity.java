package Behaviours;

import Parents.Visitor;

public interface ISecurity {
    public boolean isAllowedTo(Visitor visitor);
    //ISecurity promises boolean isAllowedTo(Visitor)
}
