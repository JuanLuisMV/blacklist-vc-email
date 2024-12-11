//jl, s
package servicio;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author nico0
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(servicio.DataCreditoService.class);
        resources.add(servicio.Operaciones.class);
        resources.add(servicio.TableroControl.class);
        resources.add(servicio.VerificacionCrediticiaService.class);
    }
    
}
