package org.gatein.tools.forge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jboss.forge.project.dependencies.Dependency;
import org.jboss.forge.project.dependencies.DependencyBuilder;
import org.jboss.forge.project.dependencies.ScopeType;

/**
 * 
 * @author bleathem
 */
public enum GateInVersion
{

   RICHFACES_4_0_0("RichFaces 4.0.0.Final",
            Arrays.asList(
                     DependencyBuilder.create("org.richfaces.ui:richfaces-components-ui:4.0.0.Final"),
                     DependencyBuilder.create("org.richfaces.core:richfaces-core-impl:4.0.0.Final")
                     ),
            Arrays.asList(
                     DependencyBuilder.create("org.richfaces:richfaces-bom:4.0.0.Final").setScopeType(ScopeType.IMPORT)
                              .setPackagingType("pom")
                     )
    ),
    RICHFACES_3_3_3("RichFaces 3.3.3.Final",
             Arrays.asList(
                      DependencyBuilder.create("org.richfaces.ui:richfaces-ui:3.3.3.Final"),
                      DependencyBuilder.create("org.richfaces.framework:richfaces-impl:3.3.3.Final"),
                      DependencyBuilder.create("org.richfaces.framework:richfaces-api:3.3.3.Final")
                      ),
             Collections.EMPTY_LIST
    );

   private List<? extends Dependency> dependencies;
   private List<? extends Dependency> dependencyManagement;
   private String name;

   private GateInVersion(String name, List<? extends Dependency> deps, List<? extends Dependency> depManagement)
   {
      this.name = name;
      this.dependencies = deps;
      this.dependencyManagement = depManagement;
   }

   public List<? extends Dependency> getDependencies()
   {
      return dependencies;
   }

   public List<? extends Dependency> getDependencyManagement()
   {
      return dependencyManagement;
   }

   @Override
   public String toString()
   {
      return name;
   }
}
