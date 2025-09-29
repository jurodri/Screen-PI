package com.example.vigillatus.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.vigillatus.models.ODS
import com.example.vigillatus.models.TeamMember

@Composable
fun LandingPage(modifier: Modifier = Modifier) {
    val teamMembers = listOf(
        TeamMember(
            name = "Juliano",
            role = "Desenvolvedor Full Stack",
        )
    )

    val odsList = listOf(
        ODS(
            number = 3,
            title = "Saúde e Bem-Estar",
            description = "Assegurar uma vida saudável e promover o bem-estar para todos, em todas as idades"
        ),
        ODS(
            number = 8,
            title = "Trabalho Decente e Crescimento Econômico",
            description = "Promover o crescimento econômico sustentado, inclusivo e sustentável, emprego pleno e produtivo e trabalho decente para todos"
        )
    )

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(
                top = 24.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            )
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Vigillatus - Sistema de Monitoramento de EPI",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Para prevenir acidentes de trabalho decorrentes da não utilização do capacete de segurança que é um Equipamento de Proteção Individual (EPI) em ambientes fechados, este sistema de monitoramento utiliza câmeras de segurança integradas a um módulo de Inteligência Artificial com Visão Computacional. As imagens captadas são analisadas em tempo real por um modelo treinado com técnicas de Aprendizagem Profunda, do inglês Deep Learning, capaz de identificar automaticamente a ausência do capacete.\n\n" +
                        "Ao detectar uma infração, o sistema armazena apenas a imagem correspondente ao momento da ocorrência, otimizando o uso de espaço e garantindo o foco nas não conformidades. Além disso, o sistema oferece ao gestor relatórios detalhados por colaborador, reunindo os registros de descumprimento das normas de segurança. Isso permite uma gestão mais eficaz, promove a conscientização dos funcionários e contribui significativamente para a redução de acidentes, favorecendo um ambiente de trabalho mais seguro e saudável.",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(24.dp))
        }

        item {
            Text(
                text = "Objetivos de Desenvolvimento Sustentável",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
        }

        item {
            Column(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = "https://gtagenda2030.org.br/wp-content/uploads/2019/10/ods3.jpg",
                    contentDescription = "ODS 3 - Saúde e Bem-estar",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "ODS 3: Saúde e Bem-estar",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Assegurar uma vida saudável e promover o bem-estar para todos, em todas as idades.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Column(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = "https://gtagenda2030.org.br/wp-content/uploads/2019/10/ods8.jpg",
                    contentDescription = "ODS 8 - Trabalho Decente e Crescimento Econômico",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "ODS 8: Trabalho Decente e Crescimento Econômico",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Promover o crescimento econômico sustentado, inclusivo e sustentável, emprego pleno e produtivo e trabalho decente para todos.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
        }

        item {
            Text(
                text = "Equipe",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
        items(teamMembers) { member ->
            Column(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = "https://raw.githubusercontent.com/jurodri/compasspb_julianorodrigues/main/img/juliano.jpeg",
                    contentDescription = "Foto de ${member.name}",
                    modifier = Modifier
                        .size(230.dp)
                        .clip(RoundedCornerShape(15.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = member.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = member.role,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
