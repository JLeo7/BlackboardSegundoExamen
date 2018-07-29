package core;

import core.enums.KnowledgeSources;
import core.enums.UpdateType;

public class Controller {
    private Blackboard bb;
    private KnowledgeSource currentKS;

    public Controller(Blackboard bb) {
        this.bb = bb;
    }

    public KnowledgeSource selectKS(KnowledgeSources ks) {
        switch (ks) {
            case FIRST:
                return new KnowledgeSource(bb);
            default:
                return null;
        }
    }

    public void configureKS(KnowledgeSources ksName) {
        currentKS = selectKS(ksName);
    }

    public void executeKS(UpdateType updateType, KnowledgeSources ks) {
        configureKS(ks);
        currentKS.updateBlackboard(updateType);
    }

    public String getSolution(){
        return bb.getSolution();
    }
}
