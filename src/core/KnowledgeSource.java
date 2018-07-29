package core;

import core.enums.UpdateType;

public class KnowledgeSource {
    private Blackboard bb;

    public KnowledgeSource(Blackboard bb){
        this.bb = bb;
    }

    public void updateBlackboard(UpdateType type) {
        switch (type) {
            case ADD:
                bb.updateSolution(", agregando a la solucion",UpdateType.ADD);
                break;
            case REPLACE:
                bb.updateSolution("Esta es una nueva solucion.",UpdateType.REPLACE);
        }

    }


}
