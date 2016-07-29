package org.deeplearning4j.gym.space;

/**
 * @author rubenfiszel (ruben.fiszel@epfl.ch) on 7/8/16.
 *
 * Should contain contextual information about the Action space, which is the space of all the actions that could be available.
 * Also must know how to return a randomly uniformly sampled action.
 *
 * @param <A> the type of Action
 */
public interface ActionSpace<A> {

    /**
     * @return A randomly uniformly sampled action,
     */
    A randomAction();

    Object encode(A action);

}
