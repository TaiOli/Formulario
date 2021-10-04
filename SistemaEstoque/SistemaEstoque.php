<?php

require 'config.php'
?>

<html>
<body>
<table border="1">  

        <th>Descricao</th>
        <th>Quantidade</th> 
    <tr>
    <?php
        $sql=$pdo->prepare("SELECT *FROM produto");
        $sql->execute();
           while($lista= $sql->fetch(PDO::FETCH_ASSOC)):
        ?>
            <td><?php echo $lista["descricao"]; ?></td>
            <td> <?php echo $lista["quantidade"]; ?></td>      
        <?php
           endwhile;
        ?>
    </tr>
</table>

<a href="insertProdutos.php">Cadastrar Produtos</a>

