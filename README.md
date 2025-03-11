# TP0_Acosta_Tomas

El presente trabajo nos invita a replantearnos los patrones de diseño que utilizamos.
En el caso de mi trabajo, la forma anémica es aquella que aplica la lógica del formateo en el main. Es anémica, pues el
objeto como tal no posee ese comportamiento, actuando como una estructura de datos.
El hecho de que sea anémica hace que una capa superior deba implementar ese comportamiento, lo que hace del código un
producto acoplado y poco escalable, pues si el día de mañana Java actualiza la forma en la que se modela el tiempo,
deberá modificarse más código del deseado.
En el otro caso, la forma no anémica, el comportamiento está encapsulado en el objeto, permitiéndole a la capa superior
abstraerse de la implementación y simplemente acceder a dicho comportamiento al solicitarlo.
Esto produce un código más escalable y desacoplado, pues la capa superior no depende de la implementación del tiempo ni
de la implementación de su comportamiento.

