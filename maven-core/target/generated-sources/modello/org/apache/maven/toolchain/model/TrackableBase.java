// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.toolchain.model;

/**
 * 
 *             common base class that contains code to track the
 * source for
 *             this instance (USER|GLOBAL)
 *           .
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class TrackableBase
    implements java.io.Serializable, java.lang.Cloneable
{

      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return TrackableBase
     */
    public TrackableBase clone()
    {
        try
        {
            TrackableBase copy = (TrackableBase) super.clone();

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- TrackableBase clone()

    
                
        public static final String USER_LEVEL = "user-level";
        public static final String GLOBAL_LEVEL = "global-level";

        private String sourceLevel = USER_LEVEL;
        private boolean sourceLevelSet = false;

        public void setSourceLevel( String sourceLevel )
        {
            if ( sourceLevelSet )
            {
                throw new IllegalStateException( "Cannot reset sourceLevel attribute; it is already set to: " + sourceLevel );
            }
            else if ( !( USER_LEVEL.equals( sourceLevel ) || GLOBAL_LEVEL.equals( sourceLevel ) ) )
            {
                throw new IllegalArgumentException( "sourceLevel must be one of: {" + USER_LEVEL + "," + GLOBAL_LEVEL + "}" );
            }
            else
            {
                this.sourceLevel = sourceLevel;
                this.sourceLevelSet = true;
            }
        }

        public String getSourceLevel()
        {
            return sourceLevel;
        }
                
              
}
